class RandomNumber {
    static void main(String[] args) {
        def random = new Random().nextInt(1000)

        println "The random number is: $random"

        def sum = (0..random).sum { int num -> num * 2 }

        println "The doubled sum of numbers between 0 and $random is $sum"
    }
}
