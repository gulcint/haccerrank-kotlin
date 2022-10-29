/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */
fun jumpingOnClouds(cloudList: Array<Int>): Int {
    var jumping = 0
    var index = 0
    val unsafe = 1

    while(index < cloudList.size-1){
        if(index + 2 < cloudList.size && cloudList[index + 2] == unsafe){
            index++
        }else{
            index+=2
        }
        jumping++
    }
    return jumping
}
