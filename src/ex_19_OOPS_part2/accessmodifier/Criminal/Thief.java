package ex_19_OOPS_part2.accessmodifier.Criminal;

import ex_19_OOPS_part2.accessmodifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        // thief.CanIShoot();  he is not in the same folder as cop.
    }
}
