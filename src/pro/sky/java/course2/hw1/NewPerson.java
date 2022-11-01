package pro.sky.java.course2.hw1;

    public class NewPerson {
        private String name;
        private int age;
        public NewPerson child;
        public NewPerson parent;

        public NewPerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

