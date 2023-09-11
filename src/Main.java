public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];
        objects[0] = createObject("1й");
        objects[1] = createObject("2й");
        objects[2] = createObject("3й");
        for (Printable object : objects) {
            object.print();
        }
    }
    public static Printable createObject(String className) {
        switch (className) {
            case "1й":
                return new Level1("Poxy","Teachre",40,"Research");
            case "2й":
                return new Level2("Tom","Police", 20,"Police Academy");
            case "3й":
                return new Level3("Baks Bany","cook",27,"Stanforbd");
            default:
                throw new IllegalArgumentException("Неподдерживаемый класс: " + className);
        }
    }





    }

