import classes.Faculty;
import classes.Institute;
import classes.ResearchAssociate;

public class Main {
    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute toizi = new Institute("ТОиЗИ", "297");
        Institute is = new Institute("ИС", "387");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("ИТУ", "312п");
        Institute piit = new Institute("ПиИТ", "380");
        fkn.setInstitutes(new Institute[]{toizi, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Соломатин Дмитрий Иванович",
                "Алгоритмы и структуры данных");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Михайлов Евгений Михайлович",
                "Информационные технологии");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Самойлов Николай Константинович",
                "ООП");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "Чекмарев Андрей Игоревич",
                "Проектирование баз данных");
        piit.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ":");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] piit_employees = piit.getEmployees();
        System.out.println("Сотрудники кафедры " + piit.getName() + ":");
        for (int i = 0; i < piit_employees.length; i++) {
            System.out.println(piit_employees[i].getName());
        }
    }
}