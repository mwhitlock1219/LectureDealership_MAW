//Interfaces normally follow a naming convention similar to classes but the end in 'ible' or 'able'
// Usually adjective b/c we usually use interfaces to provide additional capabilities

interface Leaseable {
    boolean isLeaseable();

    int getLeaseTerm();

    int getMaxMilesPerYear();

    default float getMileablePenalty() {
        return 500.0f;
    }
}