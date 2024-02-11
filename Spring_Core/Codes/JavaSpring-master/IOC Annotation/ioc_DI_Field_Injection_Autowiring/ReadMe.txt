what happens if there are more than one implementation for interface "Fortune_2" now in
this case "@Autowire" will get confused like which class to choose that has implemented
the "Fortune_2" interface in that case we need to specific tell the autowire that what
class it should see for using "@Qualifier" annotation.