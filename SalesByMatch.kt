/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, list: Array<Int>): Int {
    val socks = list.groupingBy { it }.eachCount().filter { it.value > 1 }
    var matchCount = 0
    for(item in socks){
        matchCount += item.value/2
    }

    return matchCount
}