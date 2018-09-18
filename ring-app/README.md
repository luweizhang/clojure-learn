# compojure test app

`lein run`

### useful links
- https://clojurebridge.org/community-docs/docs/web-applications/easy-compojure/


# OLD (using only ring)

`$ lein repl`

```
=> (use 'ring.adapter.jetty)
=> (use 'ring-app.core)
=> (run-jetty handler {:port 3000})
```

