import listasLineares.MyArrayList;

public class main {

    public static void main(String[] args) {
        MyArrayList<String> l = new MyArrayList<>(2);


        l.add("A"); l.add("B");
        assert l.tam() == 2;
        assert l.get(0).equals("A");
        assert l.get(1).equals("B");

        l.add(1, "X"); // [A, X, B]
        assert l.tam() == 3;
        assert l.get(1).equals("X");

        assert l.contains("X");
        assert l.indexOf("B") == 2;

        String r1 = l.remove(1); // remove "X"
        assert r1.equals("X");

        assert !l.remove("Z");
        assert l.remove("A");

        String old = l.set(0, "Q"); // [Q]
        assert old.equals("B");
        assert l.get(0).equals("Q");

        l.add(null);
        assert l.contains(null);
        Object[] arr = l.toArray();
        assert arr.length == l.tam();

        // limites
        try { l.get(99); assert false : "Era pra lançar exceção"; } catch (IndexOutOfBoundsException expected) {}
        try { l.add(-1, "oops"); assert false; } catch (IndexOutOfBoundsException expected) {}
        try { l.add(l.tam()+1, "oops"); assert false; } catch (IndexOutOfBoundsException expected) {}

        System.out.println("Todos os testes passaram! Lista: " + l);
    }

}
