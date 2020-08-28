(ns clojure-playground.exemplo3)

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de " desconto)
      (- valor-bruto desconto))
    valor-bruto))

(defn aplica-desconto?
  [valor-bruto]
  (if > valor-bruto 100)
  true
  false)

(println (aplica-desconto? 1000))
(println (aplica-desconto? 100))


(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de " desconto)
      (- valor-bruto desconto))
    valor-bruto))


(defn aplica-desconto?
  [valor-bruto]
  (println "brincando com nulo")
  (if > valor-bruto 100)
  true)

(println (aplica-desconto? 1000))
(println (aplica-desconto? 100))


(defn aplica-desconto?
  [valor-bruto]
  (println "When")
  (when (> valor-bruto 100))
  true)

(println (aplica-desconto? 1000))
(println (aplica-desconto? 100))


(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(println (aplica-desconto? 1000))
(println (aplica-desconto? 100))

(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))


(defn valor-descontado
  "Retorna o valor com desconto de 10% se deve aplicar desconto"
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de " desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println "Funcao como parametros")
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))


(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))

(println "Funcao sem nome (anonima)")
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))
(println (valor-descontado (fn [v] (> v 100)) 1000))
(println (valor-descontado (fn [v] (> v 100)) 100))

(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> %1 100) 100))

(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> %1 100) 100))


(def mais-caro-que-100? (fn [valor-bruto] (> valor-bruto 100)))
(def mais-caro-que-100? #(> %1 100))
(println (valor-descontado #(> % 100) 1000))
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))








