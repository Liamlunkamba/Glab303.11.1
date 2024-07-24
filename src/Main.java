class MyRunner {

    public static void main(String[] args) {
    GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype<>("per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());

    }
}