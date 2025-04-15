    class Person {
        private String name;
        private int id;
 
        public Person(String name, int id){
            this.name = name;
            this.id = id;
        }
   
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
        }
    }