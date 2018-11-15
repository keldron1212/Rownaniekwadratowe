public class Main {
    public static void main(String[] args) {

        NumberReader numberReader = new NumberReader();

        float a = numberReader.readNextFloat("a");
        float b = numberReader.readNextFloat("b");
        float c = numberReader.readNextFloat("c");

        numberReader.scannerClose();

        EquationSolver equationSolver = new EquationSolver();

        String solution = equationSolver.solve(a, b, c);

        System.out.println(solution);

    }
}