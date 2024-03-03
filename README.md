# chisel-priority-queue

This is a hardware priority queue implemented in Chisel HDL.

### Background

The microarchitecture is based off of this paper. [Efficent-Priority-Queue](https://ieeexplore.ieee.org/document/4380693)

### Dependencies

#### JDK 8 or newer

We recommend LTS releases Java 8 and Java 11. You can install the JDK as recommended by your operating system, or use the prebuilt binaries from [AdoptOpenJDK](https://adoptopenjdk.net/).

#### SBT

SBT is the most common built tool in the Scala community. You can download it [here](https://www.scala-sbt.org/download.html).  


### Getting started

#### First lets clone the repo

```sh
git clone https://github.com/zflcs/chisel-priority-queue.git
cd chisel-priority-queue
```

#### We can generate verilog by
```sh
sbt run
```

#### We can run unit tests by
```sh
sbt test
```

If you see the below information, **it worked!**

```shell
[info] PriorityQueueTester:
[info] PriorityQueue
[info] - should work very very well
[info] Run completed in 1 second, 789 milliseconds.
[info] Total number of tests run: 1
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
```

However, the unit tests in this repository is not completed due to some reasons. But it has been tested in the [ats-int-rocket-chip](https://github.com/ATS-INTC/rocket-chip/blob/v1.6/src/main/scala/atsintc/ATSINTC.scala#L63). The test benchmark is the [atsintc.c](https://github.com/ATS-INTC/riscv-tests/blob/master/benchmarks/atsintc/atsintc.c).

The output is shown below.

```shell
a read res 0x1
a read res 0x11
a read res 0x12
a read res 0x21
a read res 0x22
a read res 0x23
a read res 0x31
a read res 0x32
a read res 0x33
a read res 0x34
a read res 0x41
a read res 0x42
a read res 0x43
a read res 0x44
a read res 0x45
a read res 0x51
a read res 0x52
a read res 0x53
a read res 0x54
a read res 0x55
a read res 0x56
a read res 0x61
a read res 0x62
a read res 0x63
a read res 0x64
a read res 0x65
a read res 0x66
a read res 0x67
a read res 0x71
a read res 0x72
a read res 0x73
a read res 0x74
a read res 0x75
a read res 0x76
a read res 0x77
a read res 0x78
```

