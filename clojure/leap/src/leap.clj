(ns leap)

(defn- divides? [a, b]
  (zero? (mod a b)))

(defn leap-year? [year]
  (and (divides? year 4)
       (or (not (divides? year 100))
           (divides? year 400))))
