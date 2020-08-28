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

(def pedido {:mochila { :quantidade 2, :preco 80}
             :camiseta {
                        :quantidade 3, :preco 40}})


(println "\n\n\n\n")
(println pedido)

(assoc pedido  :chaveiro {:quantidade 1, :preco 10})

(def pedido (assoc pedido  :chaveiro {:quantidade 1, :preco 10}))

(println pedido)
(println (pedido :mochila))
(println (get pedido :mochila))
(println (get pedido :cadeira))
(println (get pedido :cadeira {}))
(println (:mochila pedido))
(println (:cadeira pedido {}))

(println (:quantidade (:mochila pedido)))
(println (update-in pedido [:mochila  :quantidade] inc))

(println (:quantidade (:mochila pedido)))

(println (-> pedido
             :mochila
             :quantidade))

(-> pedido
    :mochila ,,,
    :quantidade ,,,
    println ,,,)



