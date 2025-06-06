# rock-paper-scissors

[![CircleCI](https://circleci.com/gh/lagenorhynque/rock-paper-scissors.svg?style=svg)](https://circleci.com/gh/lagenorhynque/rock-paper-scissors)

A [re-frame](https://github.com/Day8/re-frame) application designed to ... well, that part is up to you.

## Prepare

npm i react react-dom@18.3.1 react@18.3.1

npx shadow-cljs release :frontend

## Development Mode

### Start Cider from Emacs:

Put this in your Emacs config file:

```
(setq cider-cljs-lein-repl
	"(do (require 'figwheel-sidecar.repl-api)
         (figwheel-sidecar.repl-api/start-figwheel!)
         (figwheel-sidecar.repl-api/cljs-repl))")
```

Navigate to a clojurescript file and start a figwheel REPL with `cider-jack-in-clojurescript` or (`C-c M-J`)

### Run application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

### Run tests:

```
lein clean
lein run-test  # = lein doo phantom test once
# or
lein watch-test  # = lein doo phantom test
```

The above command assumes that you have [phantomjs](https://www.npmjs.com/package/phantomjs) installed. However, please note that [doo](https://github.com/bensu/doo) can be configured to run cljs.test in many other JS environments (chrome, ie, safari, opera, slimer, node, rhino, or nashorn).

## Production Build


To compile clojurescript to javascript:

```
lein clean
lein cljsbuild once min
```
