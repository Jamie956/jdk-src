
# 快速开始

下载地址 open jdk：
https://mirrors.tuna.tsinghua.edu.cn/AdoptOpenJDK/8/jdk/x64/windows/

- [测试代码](https://github.com/Jamie956/jdk-src/tree/main/jdk-test)
- [jdk1.8.0_231  src.zip 解压文件](https://github.com/Jamie956/jdk-src/tree/main/jdk8u231-src)
- [jdk8u322-b06-src  src.zip 解压文件](https://github.com/Jamie956/jdk-src/tree/main/jdk8u322-b06-src)



Debug and comments step

1. Import project jdk-test
2. Modify IDEA SDKs settings, Sourcepath set as /path/to/jdk-src/src



# 策略
1. 粗看一下源码，看类的变量、内部类、实现接口、继承类、核心方法
2. 写API 测试方法
3. 调试API 方法，源码写注释



# java.util

- Collection
  - ArrayDequeue 注释
  - ArrayList 注释
  - HashSet 注释
  - LinkedHashSet 注释
  - LinkedList 注释
  - PriorityQueue 注释
  - TreeSet 注释
- Map
  - HashMap 注释
  - Treemap 注释
  - Hashtable

- concurrent
  - Collection
    - ArrayBlokingQueue 注释
    - ConcurrentHashMap 注释
    - CopyOnWriteArrayList 注释
    - CopyOnWriteArraySet 注释
    - LinkedBlockingQueue 注释
  - Lock
    - CountDownLatch 注释
    - LockSupport 注释
    - ReentrantLock 注释
    - ReentrantReadWriteLock 注释
    - Semaphore 注释
    - CyclicBarrier 注释
  - Atomic
    - AtomicInteger 注释
  - ForkJoinPool
  - FutureTask 注释
  - ThreadPoolExecutor 注释
- regex
- Stream 注释


# java.io

- ByteArrayInputStream 注释
- ByteArrayOutputStream 注释
- FileInputStream 注释
- FileOutputStream 注释
- InputStreamReader 注释
- OutputStreamWriter 注释



# java.nio

- Buffer
  - HeapByteBuffer 注释
  - ByteBuffer
  - CharBuffer
  - DoubleBuffer
  - FloatBuffer
  - IntBuffer
  - LongBuffer
  - ShortBuffer
- channels
  - ServerSocketChannel 注释
  - SocketChannel 注释
  - DatagramChannel
  - FileChannel 注释
- Selector 注释
- SelectionKey 注释


# java8
- FunctionalInterface
- Optional



# java.net/sun.net

- URL 注释
- HttpURLConnection 注释
- ServerSocket 注释
- Socket 未完
- URI



# java.lang

- reflect
  - Method
  - Proxy
  - InvocationHandler
- Thread 注释
- Throwable 注释
  - Exception 注释
    - IOException 注释
    - RuntimeException 注释
      - NullPointerException 注释
  - Error 注释
- ThreadLocal 注释
- String 注释
- Byte
- Short
- Integer 注释
- Long
- Float
- Double
- Char
- Boolean
- StringBuilder 注释
- StringBuffer 注释











































