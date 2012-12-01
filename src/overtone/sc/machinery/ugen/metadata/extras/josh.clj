(ns overtone.sc.machinery.ugen.metadata.extras.josh
  (:use [overtone.sc.machinery.ugen common check]))

(def specs
  [
   {:name "MoogVCF"
    :summary "MoogVCF is a port of the CSound opcode moogvcf."
    :args [{:name "input"
            :doc "audio input"}

           {:name "ffreq"
            :doc "cutoff freq"}

           {:name "res"
            :doc "resonance (0-1)"}]
    :rates #{:ar}
    :doc  "MoogVCF is a port of the CSound opcode moogvcf written by Josep Comajuncosas and Hans Mikelson.  This UGen is a digital emulation of the Moog diode ladder filter configuration.  It is based loosely on the paper 'Analyzing the Moog VCF with Considerations for Digital Implemnetation'  by Stilson and Smith (CCRMA)."} ])
