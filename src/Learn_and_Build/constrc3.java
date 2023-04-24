package Learn_and_Build;

// getter--> means--> (data get/fetch) returrn
//setter set() no return value- to initialize
//camelcase(Prime ,SetAge) & pascal(Prime ,SetAge)
        public class constrc3 {
         int age;
        String name;
        void setAge(int num){
            if (num > 18) {
               age=num;
            }
         }
int getAge(){
    return age;
}

    public static void main(String[] args) {
        constrc3 obj = new constrc3();
           obj.setAge(25);
        System.out.println(obj.getAge());
        System.out.println("Age is not valid"+obj.getAge());
    }
}
