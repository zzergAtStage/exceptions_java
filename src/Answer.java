class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if (a == null || b == null || a.length != b.length) return new int[1];
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            try {
                c[i] = a[i]/b[i];
            } catch (RuntimeException e) {
                return new int[1];
            }
        }
        return c;

    }
}