
public class operators {

    public static void main(String[] args) {
        /*  basic operators :
            1) +, -, *, /, %
         */
        int a = 10;
        int b = 5;
        int c = 3;
        int d = 155;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // Note: here, it will print 3, not 3.3333. Because it will safe into an int var. 
        System.out.println((double) (a / c)); // Note: here, it will print 3.0; Because it convert to double after.
        System.out.println(a / (double) c); // Note: here, it will print 3.3333; Because it convert to double before.
        System.out.println(a % b);

        // ++, -- only can use on variables. 
        System.out.println(d++); // pint a first(155), then add one, a = 156.
        System.out.println(d--); // pint a first(156), then sub one, a = 155.
        System.out.println(++d); // add one to a first(156), then print.a
        System.out.println(--d); // sub one to a first(155), then print.a

        int p = 3;
        int q = 5;
        int pq = p++ + ++p - --q + q-- - p-- + ++q + 2; // 3+5-4+4-5+4+2=9
        System.out.println(pq);

        // 2) concat operator + (for string):
        System.out.println("Hello" + "World");
        System.out.println('a' + 'b'); // it will not be "ab", b/c it will treat both side as ints and get the sum of them.
        System.out.println((char) ('a' + 'b')); // it will be a char of the number of the sum of 97 + 98.
        System.out.println("" + 'a' + 'b'); // it will print ab.

        // 3) =, +=, -+, *=, /=, %=
        int e = 5;
        e += 3;
        System.out.println(e); // (e = e + 3)

        // 4) relationship operators:
        // ==, !=, >, <, >=, <=
        int a1 = 10;
        int b1 = 10;
        int c1 = 20;
        System.out.println(a1 == b1); // true
        boolean bl = a1 != c1;
        System.out.println(bl); // true

        System.out.println(a1 = c1); // print 20, b/c it will assign the value of c1 to a1, then print a1.
        
        // 5) logic operators
        // &, |, &&, ||, !, ^
        int l1 = 10;
        int l2 = 20;
        int l3 = 20;
        System.out.println(l1 == l2 & l2 == l3); // false
        System.out.println(l1 == l2 | l2 == l3); // true
        // short-circuit &&, ||: For double & and double |, if the result can be determine, the expression will short-circuit and return, could make the program run faster.
        System.out.println(l1 == l2 && l2 == l3); // false
        System.out.println(l1 == l2 || l2 == l3); // true
        System.out.println(l1 == l2 ^ l2 == l3); // true, (if LHS != RHS, LHS ^ RHS = true, otherwise LHS ^ RHS = false)
        System.out.println(!(l1 == l2 || l2 == l3)); // false

        // 6) ternary operator: 
        //     result = condition ? valueIfTrue : valueIfFalse;
        int t1 = 10;
        int t2 = 20;
        int t3 = (t1 > t2) ? t1 : t2;
        System.out.println(t3); // 20
        t3 = (t1 < t2) ? t1 : t2;
        System.out.println(t3); // 10
        System.out.println("Is t1 less than t2? " + ((t1 < t2) ? "Yes" : "Not")); // Yes
        System.out.println("Find the max value: " + ((((t1 > t2) ? t1 : t2) > t3) ? ((t1 > t2) ? t1 : t2) : t3)); // 20

        // operator precedence
        // 1: ()
        // 2: ! - ++ --
        // 3: * / %
        // 4: + -
        // 5: << >> >>>
        // 6: < <= > >=
        // 7: == !=
        // 8: &
        // 9: ^
        // 10: |
        // 11: &&
        // 12: ||
        // 13: ?:
        // 14: = += -= *= /= %= &=
    }
}
