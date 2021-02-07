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
    Latency    12.98ms    3.76ms  64.96ms   78.78%
    Req/Sec     1.94k   138.18     2.13k    76.33%
  115644 requests in 30.00s, 9.71MB read
Requests/sec:   3854.53
Transfer/sec:    331.25KB
```

Real load:
**wrk -t50 -c200 -d30s http://localhost:8080/fruits**
```
Running 30s test @ http://localhost:8080/fruits
  50 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    52.46ms   13.18ms 153.69ms   91.84%
    Req/Sec    76.34      9.59   121.00     75.15%
  114568 requests in 30.10s, 9.61MB read
Requests/sec:   3806.52
Transfer/sec:    327.12KB
```
