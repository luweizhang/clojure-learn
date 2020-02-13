# clojure-learn

### useful clojure commands

`lein new app <app_name>` create a new app <br>
`lein deps` update your dependencies <br>
`lein run` run your project’s “main” function after making sure all the dependencies are up to date. <br>
`lein test` run your project’s tests <br>
`lein uberjar` bundle up your project and all its dependencies in a single executable jar, allowing your to run it with `java -jar` directly. <br>
`lein repl` open up a repl <br>


### useful resources for learning clojure
- https://www.tutorialspoint.com/clojure/
- https://www.braveclojure.com/
- http://www.4clojure.com/


### cursive notes

- Cursive is a useful clojure plugin for intellij
- https://cursive-ide.com/

#### Setup Intellij with cursive plugin, set up REPL, and run code

1. Install cursive plugin
2. Install Java 8 Note that Java 9 or higher is not supported in SearchAPI
- With Homebrew, `brew tap adoptopenjdk/openjdk` then `brew cask install adoptopenjdk8`.
- If you already have a higher version of Java installed, select Java 8 as the SDK for SearchAPI.
-- File → Project Structure → Project → SDK

3. Setup the REPL

- Run → Edit Configurations → add Clojure REPL.

4. Select clojure.main and Run with Leiningen options.

5. Run the REPL

#### Useful intellij/cursive commands
`cmd + b` find the references <br>
`cmd + shift + p` run code selection in the REPL <br>
`cmd + shift + a` search for commands <br>
`shift + f6` replace all instances of a variable <br>
`cmd + option + f7` find all usages of a variable

### setup sublime text for clojure

1. `cmd` + `shift` + `p` to bring up the package control
2. open package control: add repository
3. install `ClojureREPL`
4. restart sublime
5. run the repl: `cmd` + `shift` + `p` and search for SublimeREPL: Clojure


### setup emacs
- https://www.braveclojure.com/basic-emacs/

### webdev

- compojure
  - https://learnxinyminutes.com/docs/compojure/
  - https://github.com/weavejester/compojure/wiki
  
  
### useful resources
- https://www.clojure-toolbox.com/
  - list of useful clojure tools
