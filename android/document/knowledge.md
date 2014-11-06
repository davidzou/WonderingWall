垃圾回收机制
=======================

### 日志信息代码清单 ###

1. GC_FOR_MALLOC: 发生堆被占满不能进行内存分配时，在分配新对象之前必须进行内存回收。
2. GC_CONCURRENT: 发生在（可能是部分的）垃圾可供回收时，通常有很多对象可以被回收。
3. GC_EXPLICIT: 显示调用System.gc()产生的垃圾收集。
4. GC_EXTERNAL_ALLOC: Honeycomb及以上版本不会出现（一切都已在堆中分配）。
5. GC_HPROF_DUMP_HEAP: 发生在创建HPROF文件时。