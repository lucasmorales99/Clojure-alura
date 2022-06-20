(defn valor-descontado
  "Retorna o valor com desconto de 10%."
  [valor-bruto]
  (let [taxa-de-desconto(/ 10 100)
        desconto        (* valor-bruto taxa-de-desconto)]
    (println "Calculando desconto de" desconto)
    (- valor-bruto desconto))) 



(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor for estritamente maior que 100."
  [valor-bruto]
  (let [taxa-de-desconto(/ 10 100)
        desconto        (* valor-bruto taxa-de-desconto)]
    (println "Calculando desconto de" desconto)
    (- valor-bruto desconto))) 