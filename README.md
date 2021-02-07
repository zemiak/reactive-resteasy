# reactive-reasteasy project

## Get the string

```
http localhost:8080/fruits
```

## Benchmarking

Warming up:
**wrk -t2 -c50 -d30s http://localhost:8080/fruits**
```
Running 30s test @ http://localhost:8080/fruits
  2 threads and 50 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.63ms    7.50ms 159.07ms   96.99%
    Req/Sec    40.85k     8.74k   54.18k    89.28%
  2431159 requests in 30.04s, 204.03MB read
Requests/sec:  80933.49
Transfer/sec:      6.79MB
```

Real load:
**wrk -t10 -c200 -d40s http://localhost:8080/fruits**
```
Running 40s test @ http://localhost:8080/fruits
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.54ms    0.96ms  82.44ms   99.03%
    Req/Sec     7.95k   367.04     8.82k    80.58%
  3164470 requests in 40.01s, 265.57MB read
  Socket errors: connect 0, read 47, write 9, timeout 0
Requests/sec:  79098.01
Transfer/sec:      6.64MB
```
