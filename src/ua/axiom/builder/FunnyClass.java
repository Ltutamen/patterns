package ua.axiom.builder;

import java.util.Calendar;

public class FunnyClass {
    public int age;
    public float price;
    private String name;
    private Calendar date;

    public FunnyClass(int age, float price, String name, Calendar date) {
        this.age = age;
        this.price = price;
        this.name = name;
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public static class FunnyClassBuilder {
        public int age;
        public float price;
        private String name;
        private Calendar date;

        public FunnyClassBuilder() {
            age = -1;
            price = -1.F;
            name = "dummy";
            date = Calendar.getInstance();
        }

        public FunnyClassBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public FunnyClassBuilder setPrice(float price) {
            this.price = price;
            return this;
        }

        public FunnyClassBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public FunnyClassBuilder setDate(Calendar date) {
            this.date = date;
            return this;
        }

        public FunnyClass build() {
            return new FunnyClass(age, price, name, date);
        }


    }
}
