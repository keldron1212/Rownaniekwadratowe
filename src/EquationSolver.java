public class EquationSolver {

    public String solve(float a, float b, float c) {
        if(checkIfEqualsZero(a)) {
            if (checkIfEqualsZero(b) & checkIfEqualsZero(c)) {
                return "Równanie tożsamościowe";
            }
            if (checkIfEqualsZero(b)) {
                return "Równanie sprzeczne";
            }
        else
            return calculateLineEquation(b, c);
        };

        float delta = calculateDelta(a, b, c);

        if(checkIfDeltaIsLessThanZero(delta)) {
            return "Brak rozwiązań!";
        };

        if (checkIfDeltaEqualsZero(delta)) {
            return calculateSingleSolution(a, b);
        }

        return calculateDoubleSolution(a, b, delta);
    }

    private String calculateDoubleSolution(float a, float b, float delta) {
        double deltaSqrt = calculateDeltaSqrt(delta);
        double firstSolution = calculateSolution(a, b, deltaSqrt);
        double secondSolution = calculateSolution(a, b, -deltaSqrt);

        return String.format("Dwa rozwiązania: %s, %s", firstSolution, secondSolution);
    }

    private double calculateSolution(float a, float b, double delta) {
        return ((-b) + delta) / (2*a);
    }

    private double calculateDeltaSqrt(float delta) {
        return Math.sqrt(delta);
    }

    private String calculateSingleSolution(float a, float b) {
        float solution = (-b) / (2 * a);
        return "Jedno rozwiązanie, równe: " + solution;
    }

    private boolean checkIfDeltaEqualsZero(float delta) {
        return delta == 0;
    }

    private boolean checkIfDeltaIsLessThanZero(float delta) {
        return delta < 0;
    }

    private float calculateDelta(float a, Float b, float c) {
        return (b*b) - (4*a*c);
    }

    private boolean checkIfEqualsZero(float a) {
        return a == 0;
    }
    private String calculateLineEquation(float b, float c){
        float lineEquationSolution = (-b) / (c);
        return "A równe 0. To nie jest równanie kwadratowe tylko liniowe o rozwiązaniu: " + lineEquationSolution;
    }
}
