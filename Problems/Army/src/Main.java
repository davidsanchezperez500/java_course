class Army {

    public static void createArmy() {
        // Create all objects here
        Unit unit1 = new Unit("sam");
        Unit unit2 = new Unit("frodo");
        Unit unit3 = new Unit("jose");
        Unit unit4 = new Unit ("xxx");
        Unit unit5 = new Unit("hhh");

        Knight knight1 =new Knight("qqq");
        Knight knight2 =new Knight("wwww");
        Knight knight3 =new Knight("qqqdd");

        General general = new General("eee");
        Doctor doctor = new Doctor("nnnn");





    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}