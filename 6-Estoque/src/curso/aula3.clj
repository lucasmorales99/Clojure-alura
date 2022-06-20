(ns curso.aula3)
(ns curso.aula3)

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de " desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))
(println (valor-descontado 100))

;----------------------------------------
(defn aplicar-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))


(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplicar-desconto?valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de " desconto)
      (- valor-bruto desconto))
    valor-bruto))


;--------------
;segunda maneira
(defn aplicar-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))

;---------------
;terceira maneira
(defn aplicar-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))

;-----------------------------------------------

(defn mais-caro-que-100?
  [valor-bruto]
  (println "deixeando caro invocacao mais-caro-que-100")
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com  desconto de 10% se deve aplicar desconto."
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valorbruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))
(println "função sem nome")
(fn [valor-bruto] (> valor-bruto 100))
(println "função parametro")
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100))1000))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100))100))
(println (valor-descontado mais-caro-que-100? 100))
(println (valor-descontado (fn [v] (> v 100))1000))
(println (valor-descontado (fn [v] (> v 100))100))
(println (valor-descontado #(> %1 100)1000))                ;pega o primeiro item do vetor
(println (valor-descontado #(> %1 100)100))
(println (valor-descontado #(> % 100)1000))                 ;pega o primeiro elemento
(println (valor-descontado #(> % 100)100))


(defn mais-caro-que-100? (fn [valor-bruto] (> valor-bruto 100)))
(def mais-caro-que-100? #(> % 100))                         ; a # serve como função aleatoria
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))



;higher order functions

