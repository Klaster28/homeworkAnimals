import Animals.Animals;
import Animals.*;


public class Main {

    public static void main(String[] args) {
        Herbivores gazel = new Herbivores("Газель", 2, "Африка", 60, "Tрава");
        Herbivores zhiraf = new Herbivores("Жираф", 3, "Африка", 40, "Трава");
        Herbivores horse = new Herbivores("Лошадь", 3, "Степи", 50, "Трава");
        Predators giena = new Predators("Гиена", 5, "Африка", 20, "Мясо");
        Predators tiger = new Predators("Тигр", 2, "Дальний восток", 40, "Мясо");
        Predators bear = new Predators("Медведь", 6, "Леса", 40, "Мясо");
        Amphibians laygushka = new Amphibians("Лягушка", 1, "Водоемы");
        Amphibians uzh = new Amphibians("Уж пресноводный", 3, "Водоемы");
        Flightless pavlin = new Flightless("Павлин", 2, "Тропики", "Ходит");
        Flightless pingvin = new Flightless("Пингвин", 2, "Антарктида", "Ходит");
        Flightless dodo = new Flightless("Птица Додо", 2, "Озера", "Ходит");
        Flying chaika = new Flying("Чайка", 3, "Берег водоемов", "Летает");
        Flying albatros = new Flying("Альбатрос", 6, "Берег водоемов", "Летает");
        Flying sokol = new Flying("Сокол", 3, "Горы", "Летает");

        System.out.println(gazel.equals(zhiraf));
        System.out.println(gazel + " " + gazel.getClass() + "\n" +
                zhiraf + " " + zhiraf.getClass()+ "\n" +
                horse + " " + horse.getClass()+ "\n" +
                giena + " " + giena.getClass()+ "\n" +
                tiger + " " + tiger.getClass()+ "\n" +
                bear + " " + bear.getClass()+ "\n" +
               laygushka + " " + laygushka.getClass()+ "\n" +
                uzh + " " + uzh.getClass()+ "\n" +
                pavlin + " " + pavlin.getClass()+ "\n" +
                pingvin + " " + pingvin.getClass()+ "\n" +
                dodo + " " + dodo.getClass()+ "\n" +
                chaika + " " + chaika.getClass()+ "\n" +
                albatros + " " + albatros.getClass()+ "\n" +
                sokol + " " + sokol.getClass()+ "\n");

    }
}