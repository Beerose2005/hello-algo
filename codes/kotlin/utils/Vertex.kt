/**
 * File: Vertex.kt
 * Created Time: 2024-01-25
 * Author: curtishd (1023632660@qq.com)
 */

package utils

/* 顶点类 */
class Vertex(val value: Int) {
    companion object {
        /* 输入值列表 vals ，返回顶点列表 vets */
        fun valsToVets(vals: IntArray): Array<Vertex?> {
            val vets = arrayOfNulls<Vertex>(vals.size)
            for (i in vals.indices) {
                vets[i] = Vertex(vals[i])
            }
            return vets
        }

        /* 输入顶点列表 vets ，返回值列表 vals */
        fun vetsToVals(vets: List<Vertex?>): List<Int> {
            val vals = ArrayList<Int>()
            for (vet in vets) {
                vals.add(vet!!.value)
            }
            return vals
        }
    }
}