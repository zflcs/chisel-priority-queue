package priorityqueue


import chisel3._
import chisel3.util._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class PriorityQueueTester extends AnyFlatSpec with ChiselScalatestTester {
    behavior of "PriorityQueue"
    it should "work very very well" in {
        test(new PriorityQueue(8, 32, 64)) { pq =>
            // reset
            pq.reset.poke(true.B)
            pq.clock.step(1)

            def enqueue(priority: Int, data: Int) {
                pq.io.enqs(priority).valid.poke(true.B)
                pq.io.enqs(priority).bits.poke(data.U)
                pq.clock.step(1)
                println(pq.io.enqs(priority).ready.peek())
                pq.clock.step(1)
                pq.io.enqs(priority).valid.poke(false.B)
                pq.clock.step(3)
            }

            def dequeue(): UInt = {
                pq.io.deq.ready.poke(true.B)
                pq.clock.step(1)
                println(pq.io.deq.valid.peek())
                pq.io.deq.bits.peek()
            }

            enqueue(0, 0x199)
            println(dequeue())
            
        }
    }
}
