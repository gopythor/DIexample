public class Morning {
    private Cafe_B cafe_b;

    public static void main(String args[]){


        Latte latte = new Latte(); // 외부에서 라떼 객체 생성
        Morning morning = new Morning(latte); // 여기 객체는 라떼 객체 주입
        morning.cafe_b.where();
        morning.cafe_b.drink();

        Moca moca = new Moca(); // 외부에서  모카 객체 생성
        Morning morning2 = new Morning(moca); // 이번에 객체는 모카 객체 주입
        morning2.cafe_b.where();
        morning2.cafe_b.drink();

    }


    public Morning(Cafe_B cafe_b) {
        this.cafe_b = cafe_b;
        // 주인장 왈 : 먹고 싶은 커피는 객체 만들때 알아서 결정하쇼
    }
}
