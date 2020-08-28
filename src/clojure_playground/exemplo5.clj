(ns clojure-playground.exemplo5)

(def estoque {"Mochila" 10
              "Camiseta" 5 })
(println estoque)

(println "Temos" (count estoque) "elementos")
(println "Chaves " (keys estoque))
(println "Valores" (vals estoque))

(def estoque { :mochila 10
              :camiseta 5})

(println (assoc estoque :cadeira 3))
(println estoque)
(println (assoc estoque :mochila 1))
(println estoque)

(println (update estoque :mochila inc))

(defn tira-um
  [valor]
  (println "tirando um" valor)
  (- valor 1))

(println (update estoque :mochila tira-um))
(println estoque)
(println (update estoque :mochila #(- % 3)))
(println estoque)

(println (dissoc estoque :mochila))


