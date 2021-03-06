import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;


public class Server extends Thread{

	Socket sock;
	
	public Server(Socket sock){
		this.sock = sock;
	}
	
	public void run(){
		InputStream is =null;
		InputStreamReader isr= null;
		BufferedReader br =null;
		
		OutputStream os =null;
		FileInputStream fis =null;
		File file =null;
		try {
			SocketAddress addr= sock.getRemoteSocketAddress();
			is=sock.getInputStream();
			isr = new InputStreamReader(is);
			br= new BufferedReader(isr);
			String request = br.readLine();
			System.out.println(request);
			String[] arr=request.split(" ");
			if(arr[1].equals("/")){
				arr[1]="/index.html";
			}
			file= new File("www"+arr[1]);
			os =sock.getOutputStream();
			////////
			os.write("HTTP/1.1 200 OK\r\n".getBytes());
			os.write("content-type: text/html; charset=utf-8 \r\n".getBytes());
			os.write("\r\n".getBytes());// 본문과 헤더 정보의 구분을 위해 개행
//			os.write("<h1>hello world..</h1>".getBytes());
			
			fis= new FileInputStream(file);
			int su= -1;
			while((su=fis.read())!=-1){
				os.write(su);
			}
			
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(fis!=null)fis.close();
				if(os!=null)os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		int port =8080;
		ServerSocket serv=null;
		
		try {
			serv=new ServerSocket(port);
			while(true){
				Socket sock = serv.accept();
				Server thr=new Server(sock);
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(serv!=null)serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
