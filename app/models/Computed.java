package models;

import play.*;
import play.mvc.*;

import play.data.*;



public class Computed {

    public String procName;
    public String hospitals[];
    public String addresses[];
    public Integer numHospitals;
    public Integer qualityScores[];
    public Integer priceScores[];
    public Double latitudes[];
    public Double longitudes[];

    public Computed(){
        procName = "";

    }

}


/*
207 - respiratory system diagnosis w ventilator support 96+ hours
208 - respiratory system diagnosis w ventilator support <96 hours
238 - major cardiovasc procedures w/o mcc
243 - permanent cardiac pacemaker implant w cc
244 - permanent cardiac pacemaker implant w/o cc/mcc
246 - perc cardiovasc proc w drug-eluting stent w mcc or 4+ vessels/stents
247 - perc cardiovasc proc w drug-eluting stent w/o mcc
249 - perc cardiovasc proc w non-drug-eluting stent w/o mcc
251 - perc cardiovasc proc w/o coronary artery stent w/o mcc
252 - other vascular procedures w mcc
253 - other vascular procedures w cc
254 - other vascular procedures w/o cc/mcc
280 - acute myocardial infarction, discharged alive w mcc
281 - acute myocardial infarction, discharged alive w cc
282 - acute myocardial infarction, discharged alive w/o cc/mcc
286 - circulatory disorders except ami, w card cath w mcc
287 - circulatory disorders except ami, w card cath w/o mcc
291 - heart failure & shock w mcc
292 - heart failure & shock w cc
293 - heart failure & shock w/o cc/mcc
300 - peripheral vascular disorders w cc
301 - peripheral vascular disorders w/o cc/mcc
303 - atherosclerosis w/o mcc
305 - hypertension w/o mcc
308 - cardiac arrhythmia & conduction disorders w mcc
309 - cardiac arrhythmia & conduction disorders w cc
310 - cardiac arrhythmia & conduction disorders w/o cc/mcc
312 - syncope & collapse
313 - chest pain
314 - other circulatory system diagnoses w mcc
315 - other circulatory system diagnoses w cc
329 - major small & large bowel procedures w mcc
330 - major small & large bowel procedures w cc
331 - major small & large bowel procedures w/o cc/mcc
371 - major gastrointestinal disorders & peritoneal infections w mcc
372 - major gastrointestinal disorders & peritoneal infections w cc
377 - g.I. Hemorrhage w mcc
378 - g.I. Hemorrhage w cc
379 - g.I. Hemorrhage w/o cc/mcc
389 - g.I. Obstruction w cc
390 - g.I. Obstruction w/o cc/mcc
391 - esophagitis, gastroent & misc digest disorders w mcc
392 - esophagitis, gastroent & misc digest disorders w/o mcc
394 - other digestive system diagnoses w cc
418 - laparoscopic cholecystectomy w/o c.D.E. W cc
439 - disorders of pancreas except malignancy w cc
460 - spinal fusion except cervical w/o mcc
469 - major joint replacement or reattachment of lower extremity w mcc
470 - major joint replacement or reattachment of lower extremity w/o mcc
473 - cervical spinal fusion w/o cc/mcc
480 - hip & femur procedures except major joint w mcc
481 - hip & femur procedures except major joint w cc
482 - hip & femur procedures except major joint w/o cc/mcc
491 - back & neck proc exc spinal fusion w/o cc/mcc
536 - fractures of hip & pelvis w/o mcc
552 - medical back problems w/o mcc
563 - fx, sprn, strn & disl except femur, hip, pelvis & thigh w/o mcc
602 - cellulitis w mcc
603 - cellulitis w/o mcc
638 - diabetes w cc
640 - misc disorders of nutrition,metabolism,fluids/electrolytes w mcc
641 - misc disorders of nutrition,metabolism,fluids/electrolytes w/o mcc
682 - renal failure w mcc
683 - renal failure w cc
684 - renal failure w/o cc/mcc
689 - kidney & urinary tract infections w mcc
690 - kidney & urinary tract infections w/o mcc
698 - other kidney & urinary tract diagnoses w mcc
699 - other kidney & urinary tract diagnoses w cc
811 - red blood cell disorders w mcc
812 - red blood cell disorders w/o mcc
853 - infectious & parasitic diseases w o.R. Procedure w mcc
870 - septicemia or severe sepsis w mv 96+ hours
871 - septicemia or severe sepsis w/o mv 96+ hours w mcc
872 - septicemia or severe sepsis w/o mv 96+ hours w/o mcc
885 - psychoses
897 - alcohol/drug abuse or dependence w/o rehabilitation therapy w/o mcc
917 - poisoning & toxic effects of drugs w mcc
918 - poisoning & toxic effects of drugs w/o mcc
948 - signs & symptoms w/o mcc
*/