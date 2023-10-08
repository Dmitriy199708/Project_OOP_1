package ru.netology.services.post;

public class Post {
    public String name; // Имя
    public String passport; // Серия № Номер паспорта
    public String patronymic; // Отчество
    public String phone; // Номер телефона
    public String surname; // Фамилия
    public boolean subscription; // Будет ли получать пользователь новости по смс
    public FormDate birthday; // Задаем переменную содержащую в себе день месяц и год
}

class FormDate {
    public int day; // день
    public int month; // месяц
    public int year; // год

}

