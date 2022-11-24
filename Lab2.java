package ru.ifmo.se.pokemon;

class Lab2 {
    public static void main(String[] args) {

        Battle b = new Battle();
        //Blissey c = new Blissey("Редиска", 10);
        //System.out.println(Arrays.toString(c.getMoves()));

        b.addAlly(new Happiny("Соня",10));
        b.addAlly(new Clamperl("Белоснежка",10));
        b.addAlly(new Gorebyss("С-Пивом-Потянет",10));

        b.addFoe(new Carbink("Редиска", 10));
        b.addFoe(new Blissey("Пухля", 10));
        b.addFoe(new Chansey("Чупырик", 10));

        b.go();
    }
}