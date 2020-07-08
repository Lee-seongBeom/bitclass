package src.com.bit.day09;

class Car{
    final String model; // 자바의 장점 : 캡슐화 (정보의 은닉) - final 또는 private 접근제한자 사용  
    private int limit=150;
    private int speed=0;
    private int accel=5;

    Car(){
        model="승용차";
        limit=150;
        accel=10;
    }
    Car(String name, int a,int b){ //생성자를 통해 강제성을 부여함 - 생성자 오버로딩
        model = name;
        limit = a;
        accel = b;
    }



    void speedUp(){
        int go = speed+=accel;
        if((go)>limit){
            speed = limit;
        }
    }

    void speedDown(){
        //speed-=accel;
        if((speed-=accel)<0){
            speed = 0;
        }
    }

    void show(){
        System.out.println(model+"이 "+speed+"km/h로 달린다. ");

    }
} // class Car end

public class Ex04 {

    public static void main(String[] args){
        Car car = new Car();
                
        for(int i=0; i<5; i++){

        
            car.speedUp();
            car.show();
        }
        car= new Car("모닝",150,30);
        for(int i =0; i<5; i++){
            car.speedUp();
            car.show();
        }


        car=new Car("셀토스",180,15);

        for(int i=0; i<15; i++){

        
            car.speedUp();
            car.show();
        }

        for(int i =0; i<15; i++){
            car.speedDown();
            car.show();
        }



    }
    
}