public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Задание 2");
        String newFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + newFullName);

        System.out.println("Задание 3");
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName1.replace("ё", "e"));

    }
}