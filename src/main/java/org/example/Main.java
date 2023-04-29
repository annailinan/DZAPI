package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Полина";
        post.seriesNumber = "BC64";
        post.passportNumber = 598635;
        post.Patronymic = "Петровна";
        post.phone = "9648568965";
        post.surname = "Иванова";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 5;
        post.birthday.month = 5;
        post.birthday.year = 1978;

                                    }
}


