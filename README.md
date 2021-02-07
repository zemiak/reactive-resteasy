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
**wrk -t10 -c200 -d40s http://localhost:8080/fruits**
```
Running 40s test @ http://localhost:8080/fruits
  10 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    51.88ms   13.09ms 166.99ms   91.89%
    Req/Sec   387.18     19.77   525.00     73.85%
  154367 requests in 40.06s, 12.95MB read
  Socket errors: connect 0, read 14, write 0, timeout 0
Requests/sec:   3853.69
Transfer/sec:    331.18KB
```
