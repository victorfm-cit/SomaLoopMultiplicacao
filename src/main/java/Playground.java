public class Playground {

    public int SomaLoop(int n1, int n2) {
        int result = 0;
        for (int i = 0; i < n2; i++) {
            result += n1;
            System.out.println(result);
        }

        return result;
    }
}