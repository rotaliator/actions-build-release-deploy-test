(println "hello, world!")

(->> (str/split "0.0.1" #"\.")
     (mapv #(Integer/parseInt %))
     )

(-> "0.0.1"
    (str/split #"\.")
    (as-> $ (mapv #(Integer/parseInt %) $))
    (update 2 inc)
    (as-> $ (str/join "." $)))
(spit )
