fun main() {
    print(chessKnight("a1"))
}

fun chessKnight(cell: String): Int {
    var upRow=if(8-cell[1].toString().toInt()>=2) 2 else if(8-cell[1].toString().toInt()==1) 1 else 0
    var downRow=if(cell[1].toString().toInt()>2) 2 else if(cell[1].toString().toInt()==2) 1 else 0
    var rightColum=if('h'-cell[0]>=2) 2 else if('h'-cell[0]==1) 1 else 0
    var leftColum=if(cell[0]>'b') 2 else if(cell[0]=='b') 1 else 0
    return  stepNumber(upRow,rightColum)+stepNumber(upRow,leftColum)+stepNumber(downRow,rightColum)+stepNumber(downRow,leftColum)
}
fun stepNumber(r:Int,c:Int):Int{
    if(r==0||c==0)
        return 0
    if(r==1 && c>1)
        return 1
    if(r==2){if(c==1) return 1;if(c==2) return 2}
    return 0}