package chap03;

    class Id {
        private static int counter = 0;
        private int id;

        // 생성자 (생성자)
        public Id() { id = ++counter; }

        // counter를 반환 메서드 (클래스 메서드)
        public static int getCounter() {
            return counter;
        }

        public int getId() { return id; }
    }

    public class IdTester {

        public static void main(String[] args) {
            Id a = new Id(); // id 1
            Id b = new Id(); // id 2

            System.out.println("a의 아이디: " + a.getId());
            System.out.println("b의 아이디: " + b.getId());

            System.out.println("부여한 아이디의 개수: " + Id.getCounter());
        }
}

