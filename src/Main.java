public class Main {
    public static void main(String[] args) {
        System.out.println("//Task 1");
       String firstName = "ivan";
       String middleName = "ivanovich";
       String lastName = "ivanov";
       String fullName = firstName +" "+ middleName+" "+lastName;
        System.out.println("ФИО сотрудника - "+fullName);

        System.out.println("//Task 2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName1);

        System.out.println("//Task 3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё","е");
        System.out.println(fullName2);
    }
}