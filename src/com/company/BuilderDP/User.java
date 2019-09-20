package com.company.BuilderDP;

public class User {
    //  we are keeping these variables private and final to ensure object is immutable and can be changed from class
    //  object only, also class doesn't have any setter methods to set it once its created!!

    private final String firstName;
    private final String lastName;
    private final String phoneNo; // optional
    private final String address; // optional
    private final int age; // optional

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.phoneNo = userBuilder.phone;
        this.address = userBuilder.address;
        this.age = userBuilder.age;
    }

    // only getter methods will be there, no setter methods to show immutability


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public static class UserBuilder{

        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }

    }
}
