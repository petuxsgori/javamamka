package prak_2;

public class realize {
    public realize() {
        Author lol = new Author("Pushkin", "iaSobaka@mail.ru", 'm');
        Author kek = new Author("Noname", "1@i.ttr", 'n');
        System.out.println(lol);
        System.out.println(kek);
        System.out.println(lol.GetName());
        System.out.println(kek.GetEmail());
        kek.SetEmail("pipidastr@@@@@");
        lol.SetName("Kolotuskin");
        System.out.println(lol.GetName());
        System.out.println(kek.GetEmail());
    }
}
