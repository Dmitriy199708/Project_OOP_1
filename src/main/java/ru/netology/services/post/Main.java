package ru.netology.services.post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post(); //Вызывваем переменную
        post.name = "Дмитрий"; // Далее заполняем данными
        post.passport = "2222 № 324422";
        post.patronymic = "Александрович";
        post.phone = "8922234871";
        post.surname = "Лютиков";
        post.subscription = true;

        post.birthday = new FormDate(); // вызываем переменную
        post.birthday.day = 15;
        post.birthday.month = 2;
        post.birthday.year = 2012;

    }
}