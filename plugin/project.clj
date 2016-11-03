(defproject puppetlabs/lein-cljsbuild "1.1.5-pl1"
  :description "ClojureScript Autobuilder Plugin"
  :url "http://github.com/emezeske/lein-cljsbuild"
  :license
    {:name "Eclipse Public License - v 1.0"
     :url "http://www.eclipse.org/legal/epl-v10.html"
     :distribution :repo}
    :dependencies [[fs "1.1.2"]]
  :profiles {
    :dev {
      :dependencies [
        [midje "1.6.3"]
        [puppetlabs/cljsbuild "1.1.5-pl1"]]
      :plugins [[lein-midje "3.1.3"]]}}
  :eval-in-leiningen true)
